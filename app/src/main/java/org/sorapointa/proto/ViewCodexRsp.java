package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexTypeData.*;
import org.sorapointa.proto.CodexTypeData;

public class ViewCodexRsp {
    public enum ViewCodexRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4209) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<Integer> pushTipsRewardList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> recentViewedPushtipsList = new ArrayList<>();
    @Tag(tag=8) public List<CodexTypeData> typeDataList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<Integer> pushTipsReadList = new ArrayList<>();
}
