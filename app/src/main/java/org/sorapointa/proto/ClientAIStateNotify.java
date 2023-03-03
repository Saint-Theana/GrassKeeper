package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientAIStateNotify {
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=15) public Integer curTactic = null;
}
