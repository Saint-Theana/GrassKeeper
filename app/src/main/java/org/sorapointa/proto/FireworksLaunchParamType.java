package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FireworksLaunchParamType {
        @Tag(tag=0) FireworksLaunchParamNone ,
        @Tag(tag=1) FireworksLaunchParamRepeat ,
        @Tag(tag=2) FireworksLaunchParamInteval ,
        @Tag(tag=3) FireworksLaunchParamDelay ,
        @Tag(tag=4) FireworksLaunchParamRoundInteval ,
        @Tag(tag=5) FireworksLaunchParamMax ;
}
