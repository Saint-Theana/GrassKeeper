package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusCultivateReq {
    public enum NIMDMBGIEOP {
        @Tag(tag=0) None ,
        @Tag(tag=22123) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer cultivateId = null;
    @Tag(tag=12) public Integer time = null;
    @Tag(tag=5) public Integer placeStep = null;
    @Tag(tag=3) public Integer undoStep = null;
    @Tag(tag=7) public Integer copyStep = null;
    @Tag(tag=8) public Integer rotateStep = null;
    @Tag(tag=13) public Integer exchangeStep = null;
    @Tag(tag=2) public Integer cultivateStep = null;
}
