package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum WindFieldDungeonFailReason {
        @Tag(tag=0) None ,
        @Tag(tag=1) Cancel ,
        @Tag(tag=2) Timeout ,
        @Tag(tag=3) AllAvatarDie ,
        @Tag(tag=4) LuaInterrupt ;
}
