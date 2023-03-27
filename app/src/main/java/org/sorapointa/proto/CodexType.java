package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CodexType {
        @Tag(tag=0) CodexNone ,
        @Tag(tag=1) CodexQuest ,
        @Tag(tag=2) CodexWeapon ,
        @Tag(tag=3) CodexAnimal ,
        @Tag(tag=4) CodexMaterial ,
        @Tag(tag=5) CodexBooks ,
        @Tag(tag=6) CodexPushtips ,
        @Tag(tag=7) CodexView ,
        @Tag(tag=8) CodexReliquary ;
}
