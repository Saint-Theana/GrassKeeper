package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AbilityScalarType {
        @Tag(tag=0) ABILITY_SCALAR_TYPE_UNKNOWN ,
        @Tag(tag=1) ABILITY_SCALAR_TYPE_FLOAT ,
        @Tag(tag=2) ABILITY_SCALAR_TYPE_INT ,
        @Tag(tag=3) ABILITY_SCALAR_TYPE_BOOL ,
        @Tag(tag=4) ABILITY_SCALAR_TYPE_TRIGGER ,
        @Tag(tag=5) ABILITY_SCALAR_TYPE_STRING ,
        @Tag(tag=6) ABILITY_SCALAR_TYPE_UINT ;
}
