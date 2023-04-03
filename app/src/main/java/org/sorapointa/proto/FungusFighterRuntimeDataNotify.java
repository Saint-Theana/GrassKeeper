package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FungusTrainingProgressDetail.*;
import org.sorapointa.proto.FungusTrainingProgressDetail;

public class FungusFighterRuntimeDataNotify {
    public enum OGHEKMNGNAM {
        @Tag(tag=0) None ,
        @Tag(tag=22858) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public FungusTrainingProgressDetail progressDetail = null;
}
