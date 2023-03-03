package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexTypeData.*;
import org.sorapointa.proto.CodexTypeData;

public class ViewCodexRsp {
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<Integer> pushTipsRewardList = new ArrayList<>();
    @Tag(tag=3) public List<Integer> recentViewedPushtipsList = new ArrayList<>();
    @Tag(tag=9) public List<CodexTypeData> typeDataList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> pushTipsReadList = new ArrayList<>();
}
