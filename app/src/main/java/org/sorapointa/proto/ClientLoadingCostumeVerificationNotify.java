package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientLoadingCostumeVerificationNotify {
    public enum ClientLoadingCostumeVerificationNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3441) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Long prefabHash = null;
    @Tag(tag=8) public Integer costumeId = null;
    @Tag(tag=13) public Long guid = null;
}
