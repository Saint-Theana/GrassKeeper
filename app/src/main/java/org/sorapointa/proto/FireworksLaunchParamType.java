package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FireworksLaunchParamType {
        @Tag(tag=0) FIREWORKS_LAUNCH_PARAM_TYPE_NONE ,
        @Tag(tag=1) FIREWORKS_LAUNCH_PARAM_TYPE_REPEAT ,
        @Tag(tag=2) FIREWORKS_LAUNCH_PARAM_TYPE_INTERVAL ,
        @Tag(tag=3) FIREWORKS_LAUNCH_PARAM_TYPE_DELAY ,
        @Tag(tag=4) FIREWORKS_LAUNCH_PARAM_TYPE_ROUND_INTERVAL ,
        @Tag(tag=5) FIREWORKS_LAUNCH_PARAM_TYPE_MAX ;
}
