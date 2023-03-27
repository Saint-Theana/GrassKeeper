package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FishBattleResult {
        @Tag(tag=0) None ,
        @Tag(tag=1) Succ ,
        @Tag(tag=2) Fail ,
        @Tag(tag=3) Timeout ,
        @Tag(tag=4) Cancel ,
        @Tag(tag=5) Exit ;
}
