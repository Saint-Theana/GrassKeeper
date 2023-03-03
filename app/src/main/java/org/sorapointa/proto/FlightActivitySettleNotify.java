package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightActivitySettleNotify {
    @Tag(tag=1) public Boolean isNewRecord = null;
    @Tag(tag=6) public Integer medalLevel = null;
    @Tag(tag=13) public Integer leftTime = null;
    @Tag(tag=9) public Integer collectNum = null;
    @Tag(tag=5) public Integer totalNum = null;
    @Tag(tag=8) public Integer groupId = null;
    @Tag(tag=10) public Integer score = null;
    @Tag(tag=4) public Boolean isSuccess = null;
}
