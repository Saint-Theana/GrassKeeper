package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeDungeonInfo {
    @Tag(tag=15) public Integer takenChestCount = null;
    @Tag(tag=12) public Integer totalChestCount = null;
    @Tag(tag=14) public Integer takenShellCount = null;
    @Tag(tag=4) public Integer dungeonId = null;
    @Tag(tag=13) public Integer totalShellCount = null;
}
