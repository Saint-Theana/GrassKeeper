package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum EnterType {
        @Tag(tag=0) EnterNone ,
        @Tag(tag=1) EnterSelf ,
        @Tag(tag=2) EnterGoto ,
        @Tag(tag=3) EnterJump ,
        @Tag(tag=4) EnterOther ,
        @Tag(tag=5) EnterBack ,
        @Tag(tag=6) EnterDungeon ,
        @Tag(tag=7) EnterDungeonReplay ,
        @Tag(tag=8) EnterGotoByPortal ,
        @Tag(tag=9) EnterSelfHome ,
        @Tag(tag=10) EnterOtherHome ,
        @Tag(tag=11) EnterGotoRecreate ;
}
