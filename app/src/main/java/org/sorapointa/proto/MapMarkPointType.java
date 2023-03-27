package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MapMarkPointType {
        @Tag(tag=0) Npc ,
        @Tag(tag=1) Quest ,
        @Tag(tag=2) Special ,
        @Tag(tag=3) Mine ,
        @Tag(tag=4) Collection ,
        @Tag(tag=5) Monster ,
        @Tag(tag=6) FishPool ;
}
