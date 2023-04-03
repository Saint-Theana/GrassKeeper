package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexTypeData.*;
import org.sorapointa.proto.CodexTypeData;

public class ViewCodexReq {
    public enum ViewCodexReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4203) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public List<CodexTypeData> typeDataList = new ArrayList<>();
}
