package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BartenderLevelInfo.*;
import org.sorapointa.proto.BartenderLevelInfo;
import org.sorapointa.proto.BartenderTaskInfo.*;
import org.sorapointa.proto.BartenderTaskInfo;

public class BartenderActivityDetailInfo {
    @Tag(tag=3) public List<Integer> unlockItemList = new ArrayList<>();
    @Tag(tag=13) public Boolean isDevelopModuleOpen = null;
    @Tag(tag=6) public Boolean isContentClosed = null;
    @Tag(tag=5) public List<BartenderLevelInfo> unlockLevelList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> unlockFormulaList = new ArrayList<>();
    @Tag(tag=2) public List<BartenderTaskInfo> unlockTaskList = new ArrayList<>();
}
