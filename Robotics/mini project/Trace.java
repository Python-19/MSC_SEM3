/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahesh
 */
import ch.aplu.robotsim.*;
public class Trace {
    static{
        RobotContext.setStartPosition(429,236);
        RobotContext.useBackground("C:/Users/Mahesh/Desktop/Robotics/sprites/yellowpath.gif");
    }
    public Trace(){
        LegoRobot legoRobot=new LegoRobot();
        Gear gearbox=new Gear();
        LightSensor lightSensor=new LightSensor(SensorPort.S3);
        LightSensor lightSensor1=new LightSensor(SensorPort.S1);
        LightSensor lightSensor2=new LightSensor(SensorPort.S2);
        
        legoRobot.addPart(gearbox);
        legoRobot.addPart(lightSensor);
        legoRobot.addPart(lightSensor1);
        legoRobot.addPart(lightSensor2);
        
        gearbox.forward();
        gearbox.setSpeed(120);
        
        
        
        while(true){
            int lightSensorValue = lightSensor.getValue();
            int lightSensorValue1 = lightSensor1.getValue();
            int lightSensorValue2 = lightSensor2.getValue();
            
            if(lightSensorValue>900)
                gearbox.forward();
            else if(lightSensorValue2 >956)
                gearbox.leftArc(0.02);
            else if (lightSensorValue1 >600)
                gearbox.rightArc(0.02);
                
            
    /*        System.out.println(lightSensorValue); */
        }
        
        
    }

public static void main(String []args){
        Trace trace = new Trace();
    }
}


