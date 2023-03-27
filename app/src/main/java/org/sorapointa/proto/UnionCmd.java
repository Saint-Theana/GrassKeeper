package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnionCmd {
    @Tag(tag=3) public Integer messageId = null;
    @Tag(tag=5) public byte[] body = null;
}
