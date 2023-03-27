package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FirstStageInfo {
    @Tag(tag=13) public Integer score = null;
    @Tag(tag=8) public Integer eliteCnt = null;
    @Tag(tag=3) public Integer timidCnt = null;
    @Tag(tag=1) public Integer brutalCnt = null;
}
