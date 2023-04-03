package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ServerBuffChangeNotify_ServerBuffChangeType.*;
import org.sorapointa.proto.ServerBuffChangeNotify_ServerBuffChangeType;
import org.sorapointa.proto.ServerBuff.*;
import org.sorapointa.proto.ServerBuff;

public class ServerBuffChangeNotify {
    public enum ServerBuffChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=315) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<ServerBuff> serverBuffList = new ArrayList<>();
    @Tag(tag=10) public List<Long> avatarGuidList = new ArrayList<>();
    @Tag(tag=4) public Integer serverBuffChangeType = null;
    @Tag(tag=1) public List<Integer> entityIdList = new ArrayList<>();
    @Tag(tag=5) public Boolean isCreatureBuff = null;
}
