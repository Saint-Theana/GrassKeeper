package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EchoNotify {
    @Tag(tag=4) public Integer seqId = null;
    @Tag(tag=9) public String content = null;
}