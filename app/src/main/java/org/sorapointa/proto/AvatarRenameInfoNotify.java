package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarRenameInfo.*;
import org.sorapointa.proto.AvatarRenameInfo;

public class AvatarRenameInfoNotify {
    public enum HEGAMGBFDLO {
        @Tag(tag=0) None ,
        @Tag(tag=1665) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<AvatarRenameInfo> avatarRenameList = new ArrayList<>();
}
