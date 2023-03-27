package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderInfo {
    @Tag(tag=15) public List<BartenderTaskInfo> unlockTaskList = new ArrayList<>();
    @Tag(tag=10) public Boolean isDevelopModuleOpen = null;
    @Tag(tag=8) public List<Integer> unlockItemList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> unlockFormulaList = new ArrayList<>();
    @Tag(tag=2) public Boolean isContentClosed = null;
    @Tag(tag=4) public List<BartenderLevelInfo> unlockLevelList = new ArrayList<>();
}
