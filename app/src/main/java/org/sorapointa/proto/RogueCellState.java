package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RogueCellState {
        @Tag(tag=0) RogueCellNone ,
        @Tag(tag=1) RogueCellBattle ,
        @Tag(tag=2) RogueCellSuccess ,
        @Tag(tag=3) RogueCellFinish ,
        @Tag(tag=4) RogueCellTakenChest ;
}
