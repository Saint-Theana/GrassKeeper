package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexTypeData.*;
import org.sorapointa.proto.CodexTypeData;

public class CodexDataFullNotify {
    public enum CodexDataFullNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4207) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<Integer> recentViewedPushtipsList = new ArrayList<>();
    @Tag(tag=11) public Integer lastReadPushtipsCodexId = null;
    @Tag(tag=10) public Integer lastReadPushtipsTypeId = null;
    @Tag(tag=8) public List<CodexTypeData> typeDataList = new ArrayList<>();
}
