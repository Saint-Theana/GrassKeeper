package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GadgetBornType {
        @Tag(tag=0) GadgetBornNone ,
        @Tag(tag=1) GadgetBornInAir ,
        @Tag(tag=2) GadgetBornPlayer ,
        @Tag(tag=3) GadgetBornMonsterHit ,
        @Tag(tag=4) GadgetBornMonsterDie ,
        @Tag(tag=5) GadgetBornGadget ,
        @Tag(tag=6) GadgetBornGround ;
}
