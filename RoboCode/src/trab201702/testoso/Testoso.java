package trab201702.testoso;

import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;
 
public class Testoso extends Robot {
 
    /**
     * run: Zarelli's default behavior
     */
    @Override
    public void run() {
        // Initialization of the robot should be put here
 
        // After trying out your robot, try uncommenting the import at the top,
        // and the next line:
 
        // setColors(Color.red,Color.blue,Color.green); // body,gun,radar
 
        // Robot main loop
        while (true) {
            // Replace the next 4 lines with any behavior you would like
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
            
            onScannedRobot();
            
            
        }
    }
 
    /**
     * onScannedRobot: What to do when you see another robot
     */
    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        // Replace the next line with any behavior you would like
        double gunTurnAmt = Utils.normalRelativeAngle(e.getBearing() + (getHeading() - getRadarHeading()));
        turnGunRight(gunTurnAmt);
    }
 
    public void onScannedRobot() {
        
        fire(30);
        
    }
    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        back(10);
 
    }
 
    /**
     * onHitWall: What to do when you hit a wall
     */
    @Override
    public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        back(20);
    }

    /*Patrick Gay*/
}