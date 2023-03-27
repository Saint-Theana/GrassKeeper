package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlowerInfo {
    @Tag(tag=7) public Integer curScore = null;
    @Tag(tag=6) public Integer targetScore = null;
    @Tag(tag=8) public Integer endTime = null;
}
