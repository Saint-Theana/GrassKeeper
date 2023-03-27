package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeDungeonInfo {
    @Tag(tag=8) public Integer totalShellCount = null;
    @Tag(tag=2) public Integer takenShellCount = null;
    @Tag(tag=5) public Integer dungeonId = null;
    @Tag(tag=4) public Integer takenChestCount = null;
    @Tag(tag=13) public Integer totalChestCount = null;
}
