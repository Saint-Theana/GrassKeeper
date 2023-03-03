package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AnnounceData {
    @Tag(tag=9) public String countDownText = null;
    @Tag(tag=8) public String centerSystemText = null;
    @Tag(tag=1) public Integer countDownFrequency = null;
    @Tag(tag=7) public Integer configId = null;
    @Tag(tag=4) public Integer beginTime = null;
    @Tag(tag=11) public Integer centerSystemFrequency = null;
    @Tag(tag=2) public String dungeonConfirmText = null;
    @Tag(tag=14) public Boolean isCenterSystemLast_5EveryMinutes = null;
    @Tag(tag=10) public Integer endTime = null;
}
