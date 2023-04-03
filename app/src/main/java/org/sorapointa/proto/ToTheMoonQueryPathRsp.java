package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PathStatusType.*;
import org.sorapointa.proto.PathStatusType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ToTheMoonQueryPathRsp {
    public enum DEPALAPFJJF {
        @Tag(tag=0) None ,
        @Tag(tag=6155) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer queryId = null;
    @Tag(tag=15) public Integer queryStatus = null;
    @Tag(tag=10,isSigned=true) public List<Long> index = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<Vector> corners = new ArrayList<>();
    @Tag(tag=13,isSigned=true) public List<Integer> level = new ArrayList<>();
}
