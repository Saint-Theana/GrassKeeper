package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBlockDotPattern {
    @Tag(tag=8) public Integer width = null;
    @Tag(tag=11) public Integer height = null;
    @Tag(tag=9) public byte[] data = null;
}
