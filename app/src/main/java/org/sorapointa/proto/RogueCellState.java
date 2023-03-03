package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RogueCellState {
        @Tag(tag=0) ROGUE_CELL_STATE_NONE ,
        @Tag(tag=1) ROGUE_CELL_STATE_BATTLE ,
        @Tag(tag=2) ROGUE_CELL_STATE_SUCCESS ,
        @Tag(tag=3) ROGUE_CELL_STATE_FINISH ,
        @Tag(tag=4) ROGUE_CELL_STATE_TAKEN_CHEST ;
}
