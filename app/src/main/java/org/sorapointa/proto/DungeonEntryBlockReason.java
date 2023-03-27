package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonEntryBlockReason {
        @Tag(tag=0) DungeonEntryReasonNone ,
        @Tag(tag=1) DungeonEntryReasonLevel ,
        @Tag(tag=2) DungeonEntryReasonQuest ,
        @Tag(tag=3) DungeonEntryReasonMuliple ;
}
