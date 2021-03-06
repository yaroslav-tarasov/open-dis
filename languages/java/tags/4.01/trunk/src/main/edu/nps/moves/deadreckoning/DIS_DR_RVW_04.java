package edu.nps.moves.deadreckoning;

import edu.nps.moves.deadreckoning.utils.*;
/**
 * (PRIMARY Methods group) Rotating, rate of velocity, world coordinates || Linear Motion with 
 * Acceleration and rotation
 * 
 * @author Sheldon L. Snyder
 */
public class DIS_DR_RVW_04 extends DIS_DeadReckoning
{
    // put these in main abstract class...?
    Matrix ident = new Matrix(3);
    Matrix DR = new Matrix(3);
    Matrix DRR = new Matrix(3);
   
    
    /**
     * The driver for a DIS_DR_RVW_04 DR algorithm from the Runnable interface
     * <p>
     * Rotation and linear motion with acceleration
     */
    public void run()
    {
        try
        {            
            while(true)
            {
                deltaCt++;
                Thread.sleep(stall);    

                entityLocation_X += (entityLinearVelocity_X * changeDelta) + (.5 * entityLinearAcceleration_X * changeDelta * changeDelta);
                entityLocation_Y += (entityLinearVelocity_Y * changeDelta) + (.5 * entityLinearAcceleration_Y * changeDelta * changeDelta);
                entityLocation_Z += (entityLinearVelocity_Z * changeDelta) + (.5 * entityLinearAcceleration_Z * changeDelta * changeDelta);
                
                makeThisDR();
                
                DRR = Matrix.mult(DR, initOrien);
                        
                entityOrientation_theta = (float)Math.asin(-DRR.cell(0, 2));                
                entityOrientation_psi = (float)
                        (   Math.acos(  DRR.cell(0, 0) /  Math.cos(entityOrientation_theta)  ) 
                            * Math.signum(DRR.cell(0, 1)));
                entityOrientation_phi = (float)(Math.acos(DRR.cell(2, 2) / 
                            Math.cos(entityOrientation_theta)) * Math.signum(DRR.cell(1, 2)));              
                
                if(Double.isNaN(entityOrientation_psi))
                    entityOrientation_psi = 0;
                if(Double.isNaN(entityOrientation_theta))
                    entityOrientation_theta = 0;
                if(Double.isNaN(entityOrientation_phi))
                    entityOrientation_phi = 0;
            }//while(true)  
        }// try
        catch(Exception e)
        {   
            System.out.println(e);     
        }
    }//run()--------------------------------------------------------------------
    
    
    
    /***************************************************************************
     * Makes this iterations DR matrix
     * @throws java.lang.Exception
     */
    private void makeThisDR() throws Exception
    {
        double wDelta = wMag * changeDelta * deltaCt;  
        double cosWdelta = Math.cos(wDelta);

        double wwScale = (1 - cosWdelta) / wSq; 
        double identScalar = cosWdelta;
        double skewScale = Math.sin(wDelta) / wMag;
                
        Matrix wwTmp = ww.mult(wwScale);
        Matrix identTmp = ident.mult(identScalar);
        Matrix skwTmp = skewOmega.mult(skewScale);
        
        DR = Matrix.add(wwTmp, identTmp);
        DR = Matrix.subtract(DR, skwTmp);
    }//makeThisDR() throws Exception--------------------------------------------

}