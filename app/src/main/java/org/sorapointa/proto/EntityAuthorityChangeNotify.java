package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AuthorityChange.*;
import org.sorapointa.proto.AuthorityChange;

public class EntityAuthorityChangeNotify {
    public enum EntityAuthorityChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=375) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<AuthorityChange> authorityChangeList = new ArrayList<>();
}
