package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FilterType {
        @Tag(tag=0) FilterTypeAll ,
        @Tag(tag=1) FilterTypeAir ,
        @Tag(tag=2) FilterTypeWater ;
}
