package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AnnounceData {
    @Tag(tag=9) public Integer configId = null;
    @Tag(tag=14) public Integer countDownFrequency = null;
    @Tag(tag=5) public Integer endTime = null;
    @Tag(tag=4) public Integer beginTime = null;
    @Tag(tag=7) public String countDownText = null;
    @Tag(tag=12) public Boolean isCenterSystemLast5EveryMinutes = null;
    @Tag(tag=2) public String centerSystemText = null;
    @Tag(tag=8) public Integer centerSystemFrequency = null;
    @Tag(tag=13) public String dungeonConfirmText = null;
}
