package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FallPlayerBrief {
    @Tag(tag=12) public Integer uid = null;
    @Tag(tag=8) public Boolean isGround = null;
    @Tag(tag=13) public Integer score = null;
}
