package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityInfo.*;
import org.sorapointa.proto.ActivityInfo;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class GetActivityInfoRsp {
    public enum GetActivityInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2073) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<ActivityInfo> activityInfoList = new ArrayList<>();
    @Tag(tag=3) public List<Uint32Pair> disableTransferPointInteractionList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> activatedSaleIdList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
