package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AbilityScalarType {
        @Tag(tag=0) Unknow ,
        @Tag(tag=1) Float ,
        @Tag(tag=2) Int ,
        @Tag(tag=3) Bool ,
        @Tag(tag=4) Trigger ,
        @Tag(tag=5) String_ ,
        @Tag(tag=6) Uint ;
}
