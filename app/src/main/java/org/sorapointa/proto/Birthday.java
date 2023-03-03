package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Birthday {
    @Tag(tag=1) public Integer month = null;
    @Tag(tag=2) public Integer day = null;
}
