package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBlockDotPattern {
    @Tag(tag=3) public Integer width = null;
    @Tag(tag=14) public byte[] data = null;
    @Tag(tag=8) public Integer height = null;
}
