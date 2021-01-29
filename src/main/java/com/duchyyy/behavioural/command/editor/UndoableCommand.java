package com.duchyyy.behavioural.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
