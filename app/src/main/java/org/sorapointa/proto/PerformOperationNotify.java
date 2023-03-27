package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PerformOperationNotify {
    public enum GOAGPODAGOL {
        @Tag(tag=0) None ,
        @Tag(tag=1139) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Vector rot = null;
    @Tag(tag=5) public Integer operateType = null;
    @Tag(tag=14) public Vector pos = null;
    @Tag(tag=10) public Integer index = null;
    @Tag(tag=3) public Integer entityId = null;
}
