package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AreaPlayType.*;
import org.sorapointa.proto.AreaPlayType;

public class AreaPlayInfoNotify {
    public enum DOKMOHCABHF {
        @Tag(tag=0) None ,
        @Tag(tag=3069) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer detailPlayType = null;
    @Tag(tag=9) public Integer areaPlayType = null;
}
