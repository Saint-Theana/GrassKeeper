package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Investigation {
    @Tag(tag=11) public Integer progress = null;
    @Tag(tag=5) public Integer id = null;
    @Tag(tag=4) public Integer state = null;
    @Tag(tag=14) public Integer totalProgress = null;
}
