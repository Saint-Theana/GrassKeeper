package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoInfo {
    @Tag(tag=3) public Integer killEliteMonsterNum = null;
    @Tag(tag=5) public Integer killNormalMosnterNum = null;
    @Tag(tag=4) public Integer score = null;
}
