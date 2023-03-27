package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FireworksReformParamType {
        @Tag(tag=0) FireworksReformParamNone ,
        @Tag(tag=1) FireworksReformParamColor ,
        @Tag(tag=2) FireworksReformParamHeight ,
        @Tag(tag=3) FireworksReformParamSize ,
        @Tag(tag=4) FireworksReformParamDensity ,
        @Tag(tag=5) FireworksReformParamRotation ;
}
