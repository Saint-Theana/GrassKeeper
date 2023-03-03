package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityTagBriefInfo.*;
import org.sorapointa.proto.OpActivityTagBriefInfo;

public class OpActivityStateNotify {
    @Tag(tag=14) public List<Integer> finishedBonusActivityIdList = new ArrayList<>();
    @Tag(tag=13) public List<OpActivityTagBriefInfo> openedOpActivityInfoList = new ArrayList<>();
}
