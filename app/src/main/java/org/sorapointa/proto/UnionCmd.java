package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnionCmd {
    @Tag(tag=14) public byte[] body = null;
    @Tag(tag=8) public Integer messageId = null;
}
