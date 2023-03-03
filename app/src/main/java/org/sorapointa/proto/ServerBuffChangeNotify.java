package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ServerBuff.*;
import org.sorapointa.proto.ServerBuff;

public class ServerBuffChangeNotify {
    public enum ServerBuffChangeType {
        @Tag(tag=0) SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF ,
        @Tag(tag=1) SERVER_BUFF_CHANGE_TYPE_DEL_SERVER_BUFF ;
    }

    @Tag(tag=7) public ServerBuffChangeType serverBuffChangeType = null;
    @Tag(tag=10) public Boolean isCreatureBuff = null;
    @Tag(tag=1) public List<Integer> entityIdList = new ArrayList<>();
    @Tag(tag=12) public List<Long> avatarGuidList = new ArrayList<>();
    @Tag(tag=11) public List<ServerBuff> serverBuffList = new ArrayList<>();
}
